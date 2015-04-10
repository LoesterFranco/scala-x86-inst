package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Reverse Divide
// Category: general/arith

trait FIDIVR extends InstructionDefinition {
  val mnemonic = "FIDIVR"
}

object FIDIVR extends FIDIVR with OneOperand[FIDIVR] with FIDIVRImpl

trait FIDIVRImpl {
  self: FIDIVR =>
  implicit object FIDIVR_0 extends _1[m32] {
    val opcode: OneOpcode = 0xDA /+ 7
    override def hasImplicitOperand = true
  }

  implicit object FIDIVR_1 extends _1[m16] {
    val opcode: OneOpcode = 0xDE /+ 7
    override def hasImplicitOperand = true
  }
}
