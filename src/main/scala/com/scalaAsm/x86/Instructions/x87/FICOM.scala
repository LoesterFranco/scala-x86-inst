package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Compare Integer
// Category: general/compar

trait FICOM extends InstructionDefinition {
  val mnemonic = "FICOM"
}

object FICOM extends FICOM with OneOperand[FICOM] with FICOMImpl

trait FICOMImpl {
  self: FICOM =>
  implicit object FICOM_0 extends _1[m32] {
    val opcode: OneOpcode = 0xDA /+ 2
    override def hasImplicitOperand = true
  }

  implicit object FICOM_1 extends _1[m16] {
    val opcode: OneOpcode = 0xDE /+ 2
    override def hasImplicitOperand = true
  }
}
