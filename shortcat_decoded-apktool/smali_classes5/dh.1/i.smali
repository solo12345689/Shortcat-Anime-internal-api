.class public Ldh/i;
.super Ljava/lang/Object;

# interfaces
.implements LFg/j;


# instance fields
.field private final a:[B

.field private final b:Ldh/f;

.field private final c:Ldh/n;

.field private final d:[[B

.field private final e:Ljava/lang/Object;

.field private volatile f:LFg/j;


# direct methods
.method constructor <init>(Ldh/f;Ldh/n;LFg/j;[B[[B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldh/i;->b:Ldh/f;

    .line 5
    .line 6
    iput-object p2, p0, Ldh/i;->c:Ldh/n;

    .line 7
    .line 8
    iput-object p3, p0, Ldh/i;->f:LFg/j;

    .line 9
    .line 10
    iput-object p4, p0, Ldh/i;->a:[B

    .line 11
    .line 12
    iput-object p5, p0, Ldh/i;->d:[[B

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    iput-object p1, p0, Ldh/i;->e:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public a([BI)I
    .locals 1

    .line 1
    iget-object v0, p0, Ldh/i;->f:LFg/j;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LFg/j;->a([BI)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public b(B)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldh/i;->f:LFg/j;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LFg/j;->b(B)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ldh/i;->f:LFg/j;

    .line 2
    .line 3
    invoke-interface {v0}, LFg/j;->c()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public d()I
    .locals 1

    .line 1
    iget-object v0, p0, Ldh/i;->f:LFg/j;

    .line 2
    .line 3
    invoke-interface {v0}, LFg/j;->d()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method f()[B
    .locals 1

    .line 1
    iget-object v0, p0, Ldh/i;->a:[B

    .line 2
    .line 3
    return-object v0
.end method

.method g()[[B
    .locals 1

    .line 1
    iget-object v0, p0, Ldh/i;->d:[[B

    .line 2
    .line 3
    return-object v0
.end method

.method h()Ldh/f;
    .locals 1

    .line 1
    iget-object v0, p0, Ldh/i;->b:Ldh/f;

    .line 2
    .line 3
    return-object v0
.end method

.method i()[B
    .locals 3

    .line 1
    const/16 v0, 0x22

    .line 2
    .line 3
    new-array v0, v0, [B

    .line 4
    .line 5
    iget-object v1, p0, Ldh/i;->f:LFg/j;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-interface {v1, v0, v2}, LFg/j;->a([BI)I

    .line 9
    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    iput-object v1, p0, Ldh/i;->f:LFg/j;

    .line 13
    .line 14
    return-object v0
.end method

.method j()Ldh/n;
    .locals 1

    .line 1
    iget-object v0, p0, Ldh/i;->c:Ldh/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public update([BII)V
    .locals 1

    .line 1
    iget-object v0, p0, Ldh/i;->f:LFg/j;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, LFg/j;->update([BII)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
