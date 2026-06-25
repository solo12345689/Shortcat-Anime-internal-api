.class Ldh/b$a;
.super Ljava/lang/Object;

# interfaces
.implements LFg/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldh/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private final a:LFg/j;

.field private final b:I


# direct methods
.method constructor <init>(LFg/j;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldh/b$a;->a:LFg/j;

    .line 5
    .line 6
    iput p2, p0, Ldh/b$a;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a([BI)I
    .locals 3

    .line 1
    iget-object v0, p0, Ldh/b$a;->a:LFg/j;

    .line 2
    .line 3
    invoke-interface {v0}, LFg/j;->d()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    new-array v0, v0, [B

    .line 8
    .line 9
    iget-object v1, p0, Ldh/b$a;->a:LFg/j;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-interface {v1, v0, v2}, LFg/j;->a([BI)I

    .line 13
    .line 14
    .line 15
    iget v1, p0, Ldh/b$a;->b:I

    .line 16
    .line 17
    invoke-static {v0, v2, p1, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 18
    .line 19
    .line 20
    iget p1, p0, Ldh/b$a;->b:I

    .line 21
    .line 22
    return p1
.end method

.method public b(B)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldh/b$a;->a:LFg/j;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LFg/j;->b(B)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Ldh/b$a;->a:LFg/j;

    .line 7
    .line 8
    invoke-interface {v1}, LFg/j;->c()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, "/"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget v1, p0, Ldh/b$a;->b:I

    .line 21
    .line 22
    mul-int/lit8 v1, v1, 0x8

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget v0, p0, Ldh/b$a;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public update([BII)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldh/b$a;->a:LFg/j;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, LFg/j;->update([BII)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
