package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if not less nor equal/greater ((ZF=0) AND (SF=OF))
// Category: general/branch/cond

trait JG extends InstructionDefinition {
  val mnemonic = "JG"
}

object JG extends JG with OneOperand[JG] with JGImpl

trait JGImpl {
  self: JG =>
  implicit object JG_0 extends _1[rel8] {
    val opcode: OneOpcode = 0x7F
  }

  implicit object JG_1 extends _1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x8F)
  }

  implicit object JG_2 extends _1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x8F)
  }
}
