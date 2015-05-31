package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Logical Inclusive OR
// Category: general/logical

trait OR extends InstructionDefinition {
  val mnemonic = "OR"
}

object OR extends OneOperand[OR] with TwoOperands[OR] with ORImpl

trait ORLow extends OR {
  implicit object OR_0 extends _2[rm8, r8] {
    val opcode: OneOpcode = 0x08 /r
    val format = MemRegFormat
    val hasRMByte = true
  }

  implicit object OR_1 extends _2[rm16, r16] {
    val opcode: OneOpcode = 0x09 /r
    val format = MemRegFormat
    val hasRMByte = true
  }

  implicit object OR_2 extends _2[rm32, r32] {
    val opcode: OneOpcode = 0x09 /r
    val format = MemRegFormat
    val hasRMByte = true
  }

  implicit object OR_3 extends _2[rm64, r64] {
    val opcode: OneOpcode = 0x09 /r
    override def prefix = REX.W(true)
    val format = MemRegFormat
    val hasRMByte = true
  }

  implicit object OR_4 extends _2[r8, rm8] {
    val opcode: OneOpcode = 0x0A /r
    val format = RegRmFormat
    val hasRMByte = true
  }

  implicit object OR_5 extends _2[rm8, imm8] {
    val opcode: OneOpcode = 0x80 /+ 1
    val format = RmImmFormat
    val hasRMByte = true
  }

  implicit object OR_6 extends _2[rm16, imm16] {
    val opcode: OneOpcode = 0x81 /+ 1
    val format = RmImmFormat
    val hasRMByte = true
  }

  implicit object OR_7 extends _2[rm32, imm32] {
    val opcode: OneOpcode = 0x81 /+ 1
    val format = RmImmFormat
    val hasRMByte = true
  }

  implicit object OR_8 extends _2[rm64, imm32] {
    val opcode: OneOpcode = 0x81 /+ 1
    override def prefix = REX.W(true)
    val format = RmImmFormat
    val hasRMByte = true
  }

  implicit object OR_9 extends _2[rm16, imm8] {
    val opcode: OneOpcode = 0x83 /+ 1
    val format = RmImmFormat
    val hasRMByte = true
  }

  implicit object OR_10 extends _2[rm32, imm8] {
    val opcode: OneOpcode = 0x83 /+ 1
    val format = RmImmFormat
    val hasRMByte = true
  }

  implicit object OR_11 extends _2[rm64, imm8] {
    val opcode: OneOpcode = 0x83 /+ 1
    override def prefix = REX.W(true)
    val format = RmImmFormat
    val hasRMByte = true
  }
}

trait ORImpl extends ORLow {
  implicit object OR_12 extends _2[r16, rm16] {
    val opcode: OneOpcode = 0x0B /r
    val format = RegRmFormat
    val hasRMByte = true
  }

  implicit object OR_13 extends _2[r32, rm32] {
    val opcode: OneOpcode = 0x0B /r
    val format = RegRmFormat
    val hasRMByte = true
  }

  implicit object OR_14 extends _2[r64, rm64] {
    val opcode: OneOpcode = 0x0B /r
    override def prefix = REX.W(true)
    val format = RegRmFormat
    val hasRMByte = true
  }

  implicit object OR_15 extends _1[imm8] {
    val opcode: OneOpcode = 0x0C
    val format = ImmFormat
    override def hasImplicitOperand = true
    val hasRMByte = false
  }

  implicit object OR_16 extends _1[imm16] {
    val opcode: OneOpcode = 0x0D
    val format = ImmFormat
    override def hasImplicitOperand = true
    val hasRMByte = false
  }

  implicit object OR_17 extends _1[imm32] {
    val opcode: OneOpcode = 0x0D
    val format = ImmFormat
    override def hasImplicitOperand = true
    val hasRMByte = false
  }
}
