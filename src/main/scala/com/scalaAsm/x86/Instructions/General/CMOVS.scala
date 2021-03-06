package com.scalaAsm.x86
package Instructions
package General

// Description: Conditional Move - sign (SF=1)
// Category: general/datamov

trait CMOVS extends InstructionDefinition {
  val mnemonic = "CMOVS"
}

object CMOVS extends TwoOperands[CMOVS] with CMOVSImpl

trait CMOVSImpl extends CMOVS {
  implicit object _0 extends TwoOp[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x48) /r
    val format = RegRmFormat
  }

  implicit object _1 extends TwoOp[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x48) /r
    val format = RegRmFormat
  }

  implicit object _2 extends TwoOp[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x48) /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
  }
}
