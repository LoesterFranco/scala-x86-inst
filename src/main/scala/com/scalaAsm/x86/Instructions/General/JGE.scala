package com.scalaAsm.x86
package Instructions
package General

// Description: Jump short if not less/greater or equal (SF=OF)
// Category: general/branch/cond

trait JGE extends InstructionDefinition {
  val mnemonic = "JGE"
}

object JGE extends OneOperand[JGE] with JGEImpl

trait JGEImpl extends JGE {
  implicit object _0 extends OneOp[rel8] {
    val opcode: OneOpcode = 0x7D
    val format = ImmFormat
  }

  implicit object _1 extends OneOp[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x8D)
    val format = ImmFormat
  }

  implicit object _2 extends OneOp[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x8D)
    val format = ImmFormat
  }
}
