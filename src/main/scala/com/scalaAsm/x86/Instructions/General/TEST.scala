package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Logical Compare
// Category: general/arith/binary

trait TEST extends InstructionDefinition {
  val mnemonic = "TEST"
}

object TEST extends OneOperand[TEST] with TwoOperands[TEST] with TESTImpl

trait TESTLow extends TEST {
  implicit object TEST_0 extends _2[rm8, r8] {
    val opcode: OneOpcode = 0x84 /r
  }

  implicit object TEST_1 extends _2[rm16, r16] {
    val opcode: OneOpcode = 0x85 /r
  }

  implicit object TEST_2 extends _2[rm32, r32] {
    val opcode: OneOpcode = 0x85 /r
    override def explicitFormat(op1: rm32, op2: r32) = {
      if (op1.isInstanceOf[reg]) {
         Some(InstructionFormat(addressingForm = OnlyModRM(ModRMReg(TwoRegisters, op2, op1.asInstanceOf[reg])), immediate = Array()))
      } else None
    }
  }

  implicit object TEST_3 extends _2[rm64, r64] {
    val opcode: OneOpcode = 0x85 /r
    override def prefix = REX.W(true)
  }

  implicit object TEST_4 extends _2[rm8, imm8] {
    val opcode: OneOpcode = 0xF6 /+ 0
  }

  implicit object TEST_5 extends _2[rm16, imm16] {
    val opcode: OneOpcode = 0xF7 /+ 0
  }

  implicit object TEST_6 extends _2[rm32, imm32] {
    val opcode: OneOpcode = 0xF7 /+ 0
  }

  implicit object TEST_7 extends _2[rm64, imm64] {
    val opcode: OneOpcode = 0xF7 /+ 0
    override def prefix = REX.W(true)
  }
}

trait TESTImpl extends TESTLow {
  implicit object TEST_8 extends _1[imm8] {
    val opcode: OneOpcode = 0xA8
    override def hasImplicitOperand = true
  }

  implicit object TEST_9 extends _1[imm16] {
    val opcode: OneOpcode = 0xA9
    override def hasImplicitOperand = true
  }

  implicit object TEST_10 extends _1[imm32] {
    val opcode: OneOpcode = 0xA9
    override def hasImplicitOperand = true
  }
}
