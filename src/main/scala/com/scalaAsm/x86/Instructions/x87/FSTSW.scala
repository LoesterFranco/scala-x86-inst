package com.scalaAsm.x86
package Instructions
package x87

// Description: Store x87 FPU Status Word
// Category: general/control

trait FSTSW extends InstructionDefinition {
  val mnemonic = "FSTSW"
}

object FSTSW extends ZeroOperands[FSTSW] with OneOperand[FSTSW] with FSTSWImpl

trait FSTSWImpl extends FSTSW {
  implicit object _0 extends OneOp[m16] {
    val opcode: OneOpcode = 0xDD /+ 7
    val format = RmFormat
  }

  implicit object _1 extends NoOp{
    val opcode: OneOpcode = 0xDF /+ 4
        override def hasImplicitOperand = true
  }
}
