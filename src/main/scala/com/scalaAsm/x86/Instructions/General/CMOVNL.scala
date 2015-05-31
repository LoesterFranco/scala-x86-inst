package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - not less/greater or equal (SF=OF)
// Category: general/datamov

trait CMOVNL extends InstructionDefinition {
  val mnemonic = "CMOVNL"
}

object CMOVNL extends TwoOperands[CMOVNL] with CMOVNLImpl

trait CMOVNLImpl extends CMOVNL {
  implicit object CMOVNL_0 extends _2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x4D) /r
    val format = RegRmFormat
    val hasRMByte = true
  }

  implicit object CMOVNL_1 extends _2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x4D) /r
    val format = RegRmFormat
    val hasRMByte = true
  }

  implicit object CMOVNL_2 extends _2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x4D) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
    val hasRMByte = true
  }
}
