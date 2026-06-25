.class public final LM3/d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LS3/h;
.implements LM3/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM3/d$a;,
        LM3/d$b;,
        LM3/d$c;
    }
.end annotation


# instance fields
.field private final a:LS3/h;

.field public final b:LM3/c;

.field private final c:LM3/d$a;


# direct methods
.method public constructor <init>(LS3/h;LM3/c;)V
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "autoCloser"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LM3/d;->a:LS3/h;

    .line 15
    .line 16
    iput-object p2, p0, LM3/d;->b:LM3/c;

    .line 17
    .line 18
    invoke-virtual {p0}, LM3/d;->a()LS3/h;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p2, p1}, LM3/c;->k(LS3/h;)V

    .line 23
    .line 24
    .line 25
    new-instance p1, LM3/d$a;

    .line 26
    .line 27
    invoke-direct {p1, p2}, LM3/d$a;-><init>(LM3/c;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, LM3/d;->c:LM3/d$a;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public a()LS3/h;
    .locals 1

    .line 1
    iget-object v0, p0, LM3/d;->a:LS3/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, LM3/d;->c:LM3/d$a;

    .line 2
    .line 3
    invoke-virtual {v0}, LM3/d$a;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getDatabaseName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LM3/d;->a:LS3/h;

    .line 2
    .line 3
    invoke-interface {v0}, LS3/h;->getDatabaseName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getWritableDatabase()LS3/g;
    .locals 1

    .line 1
    iget-object v0, p0, LM3/d;->c:LM3/d$a;

    .line 2
    .line 3
    invoke-virtual {v0}, LM3/d$a;->a()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LM3/d;->c:LM3/d$a;

    .line 7
    .line 8
    return-object v0
.end method

.method public setWriteAheadLoggingEnabled(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LM3/d;->a:LS3/h;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LS3/h;->setWriteAheadLoggingEnabled(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
