package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Exchange Register/Memory with Register
// Category: general/datamov

trait XCHG extends InstructionDefinition {
  val mnemonic = "XCHG"
}

object XCHG extends OneOperand[XCHG] with TwoOperands[XCHG] with XCHGImpl

trait XCHGLow extends XCHG {
  implicit object XCHG_0 extends _2[r8, rm8] {
    val opcode: OneOpcode = 0x86 /r
  }
}

trait XCHGImpl extends XCHGLow {
  implicit object XCHG_1 extends _2[r16, rm16] {
    val opcode: OneOpcode = 0x87 /r
  }

  implicit object XCHG_2 extends _2[r32, rm32] {
    val opcode: OneOpcode = 0x87 /r
    override def explicitFormat(op1: r32, op2: rm32) = {
      if (op2.isInstanceOf[reg]) {
        Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op1, op2.asInstanceOf[reg])), immediate = Array()))
      } else None
    }
  }

  implicit object XCHG_3 extends _2[r64, rm64] {
    val opcode: OneOpcode = 0x87 /r
    override def prefix = REX.W(true)
  }

  implicit object XCHG_4 extends _1[r16] {
    val opcode: OneOpcode = 0x90 + rw
    override def explicitFormat(op1: r16) = Some(InstructionFormat(addressingForm = NoModRM(), immediate = Array()))
    override def hasImplicitOperand = true
  }

  implicit object XCHG_5 extends _1[r32] {
    val opcode: OneOpcode = 0x90 + rd
    override def explicitFormat(op1: r32) = Some(InstructionFormat(addressingForm = NoModRM(), immediate = Array()))
    override def hasImplicitOperand = true
  }

  implicit object XCHG_6 extends _1[r64] {
    val opcode: OneOpcode = 0x90 + ro
    override def prefix = REX.W(true)
    override def explicitFormat(op1: r64) = Some(InstructionFormat(addressingForm = NoModRM(), immediate = Array()))
    override def hasImplicitOperand = true
  }
}
