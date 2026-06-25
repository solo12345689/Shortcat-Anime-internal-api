.class public final LLf/w;
.super LGf/K;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LGf/Y;


# instance fields
.field private final synthetic c:LGf/Y;

.field private final d:LGf/K;

.field private final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(LGf/K;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LGf/K;-><init>()V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, LGf/Y;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, LGf/Y;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-static {}, LGf/V;->a()LGf/Y;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :cond_1
    iput-object v0, p0, LLf/w;->c:LGf/Y;

    .line 20
    .line 21
    iput-object p1, p0, LLf/w;->d:LGf/K;

    .line 22
    .line 23
    iput-object p2, p0, LLf/w;->e:Ljava/lang/String;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public B0(JLjava/lang/Runnable;LZd/i;)LGf/h0;
    .locals 1

    .line 1
    iget-object v0, p0, LLf/w;->c:LGf/Y;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3, p4}, LGf/Y;->B0(JLjava/lang/Runnable;LZd/i;)LGf/h0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public D1(LZd/i;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, LLf/w;->d:LGf/K;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LGf/K;->D1(LZd/i;Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public G0(JLGf/n;)V
    .locals 1

    .line 1
    iget-object v0, p0, LLf/w;->c:LGf/Y;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, LGf/Y;->G0(JLGf/n;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public O1(LZd/i;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, LLf/w;->d:LGf/K;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LGf/K;->O1(LZd/i;Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public S1(LZd/i;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LLf/w;->d:LGf/K;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LGf/K;->S1(LZd/i;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LLf/w;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
