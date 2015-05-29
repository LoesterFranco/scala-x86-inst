package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Conditional Move - not overflow (OF=0)
// Category: general/datamov

trait CMOVNO extends InstructionDefinition {
  val mnemonic = "CMOVNO"
}

object CMOVNO extends TwoOperands[CMOVNO] with CMOVNOImpl

trait CMOVNOImpl extends CMOVNO {
  implicit object CMOVNO_0 extends _2[r16, rm16] {
    val opcode: TwoOpcodes = (0x0F, 0x41) /r
  }

  implicit object CMOVNO_1 extends _2[r32, rm32] {
    val opcode: TwoOpcodes = (0x0F, 0x41) /r
    override def explicitFormat(op1: r32, op2: rm32) = {
      if (op2.isInstanceOf[reg]) {
        Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op1, op2.asInstanceOf[reg])), immediate = Array()))
      } else None
    }
  }

  implicit object CMOVNO_2 extends _2[r64, rm64] {
    val opcode: TwoOpcodes = (0x0F, 0x41) /r
    override def prefix = REX.W(true)
  }
}
