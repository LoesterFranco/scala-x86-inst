package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Jump short if parity/parity even (PF=1)
// Category: general/branch/cond

trait JPE extends InstructionDefinition {
  val mnemonic = "JPE"
}

object JPE extends JPE with OneOperand[JPE] with JPEImpl

trait JPEImpl {
  self: JPE =>
  implicit object JPE_0 extends _1[rel8] {
    val opcode: OneOpcode = 0x7A
  }

  implicit object JPE_1 extends _1[rel16] {
    val opcode: TwoOpcodes = (0x0F, 0x8A)
  }

  implicit object JPE_2 extends _1[rel32] {
    val opcode: TwoOpcodes = (0x0F, 0x8A)
  }
}
