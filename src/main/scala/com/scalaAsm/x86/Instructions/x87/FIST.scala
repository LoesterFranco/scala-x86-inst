package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Store Integer
// Category: general/datamov

trait FIST extends InstructionDefinition {
  val mnemonic = "FIST"
}

object FIST extends FIST with OneOperand[FIST] with FISTImpl

trait FISTImpl {
  self: FIST =>
  implicit object FIST_0 extends _1[m32] {
    val opcode: OneOpcode = 0xDB /+ 2
    override def hasImplicitOperand = true
  }

  implicit object FIST_1 extends _1[m16] {
    val opcode: OneOpcode = 0xDF /+ 2
    override def hasImplicitOperand = true
  }
}
