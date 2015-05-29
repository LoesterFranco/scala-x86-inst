package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - parity/parity even (PF=1)
// Category: general/datamov

trait CMOVPE extends InstructionDefinition {
  val mnemonic = "CMOVPE"
}

object CMOVPE extends TwoOperands[CMOVPE] with CMOVPEImpl

trait CMOVPEImpl extends CMOVPE {
  implicit object CMOVPE_0 extends _2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x4A) /r
  }

  implicit object CMOVPE_1 extends _2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x4A) /r
    override def explicitFormat(op1: r32, op2: rm32) = {
      if (op2.isInstanceOf[reg]) {
        Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op1, op2.asInstanceOf[reg])), immediate = Array()))
      } else None
    }
  }

  implicit object CMOVPE_2 extends _2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x4A) /r
    override def prefix = REX.W(true)
  }
}
