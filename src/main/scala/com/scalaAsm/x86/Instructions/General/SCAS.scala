package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Scan String
// Category: general/arithstring/binary

trait SCAS extends InstructionDefinition {
  val mnemonic = "SCAS"
}

object SCAS extends SCAS with ZeroOperands[SCAS] with SCASImpl

trait SCASImpl {
  self: SCAS =>
  implicit object SCAS_0 extends _0 {
    val opcode: OneOpcode = 0xAE
    override def hasImplicitOperand = true
  }
}
