package com.scalaAsm.x86
package Instructions
package System

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Load Machine Status Word
// Category: general

trait LMSW extends InstructionDefinition {
  val mnemonic = "LMSW"
}

object LMSW extends LMSW with OneOperand[LMSW] with LMSWImpl

trait LMSWImpl {
  self: LMSW =>
  implicit object LMSW_0 extends _1[rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x01) /+ 6
    override def hasImplicitOperand = true
  }
}
