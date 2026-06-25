.class public LKg/f;
.super Ljava/lang/Object;

# interfaces
.implements LFg/b;


# instance fields
.field private a:[B


# direct methods
.method private constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-array p1, p1, [B

    iput-object p1, p0, LKg/f;->a:[B

    return-void
.end method

.method public constructor <init>([B)V
    .locals 2

    const/4 v0, 0x0

    .line 2
    array-length v1, p1

    invoke-direct {p0, p1, v0, v1}, LKg/f;-><init>([BII)V

    return-void
.end method

.method public constructor <init>([BII)V
    .locals 2

    .line 3
    invoke-direct {p0, p3}, LKg/f;-><init>(I)V

    iget-object v0, p0, LKg/f;->a:[B

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method


# virtual methods
.method public a()[B
    .locals 1

    .line 1
    iget-object v0, p0, LKg/f;->a:[B

    .line 2
    .line 3
    return-object v0
.end method
