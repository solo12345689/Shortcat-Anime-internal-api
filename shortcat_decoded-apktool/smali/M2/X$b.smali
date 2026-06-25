.class public final LM2/X$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LM2/M;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LM2/X;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final c:Lw2/g$a;

.field private d:LM2/Q$a;

.field private e:LF2/w;

.field private f:LQ2/k;

.field private g:I

.field private h:LO9/t;

.field private i:I

.field private j:Lq2/x;


# direct methods
.method public constructor <init>(Lw2/g$a;LM2/Q$a;)V
    .locals 6

    .line 2
    new-instance v3, LF2/l;

    invoke-direct {v3}, LF2/l;-><init>()V

    new-instance v4, LQ2/j;

    invoke-direct {v4}, LQ2/j;-><init>()V

    const/high16 v5, 0x100000

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, LM2/X$b;-><init>(Lw2/g$a;LM2/Q$a;LF2/w;LQ2/k;I)V

    return-void
.end method

.method public constructor <init>(Lw2/g$a;LM2/Q$a;LF2/w;LQ2/k;I)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, LM2/X$b;->c:Lw2/g$a;

    .line 5
    iput-object p2, p0, LM2/X$b;->d:LM2/Q$a;

    .line 6
    iput-object p3, p0, LM2/X$b;->e:LF2/w;

    .line 7
    iput-object p4, p0, LM2/X$b;->f:LQ2/k;

    .line 8
    iput p5, p0, LM2/X$b;->g:I

    return-void
.end method

.method public constructor <init>(Lw2/g$a;LU2/u;)V
    .locals 1

    .line 1
    new-instance v0, LM2/Y;

    invoke-direct {v0, p2}, LM2/Y;-><init>(LU2/u;)V

    invoke-direct {p0, p1, v0}, LM2/X$b;-><init>(Lw2/g$a;LM2/Q$a;)V

    return-void
.end method

.method public static synthetic g(LU2/u;LB2/K1;)LM2/Q;
    .locals 0

    .line 1
    new-instance p1, LM2/d;

    .line 2
    .line 3
    invoke-direct {p1, p0}, LM2/d;-><init>(LU2/u;)V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method


# virtual methods
.method public bridge synthetic d(LQ2/k;)LM2/D$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LM2/X$b;->k(LQ2/k;)LM2/X$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic e(Lq2/C;)LM2/D;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LM2/X$b;->h(Lq2/C;)LM2/X;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic f(LF2/w;)LM2/D$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LM2/X$b;->j(LF2/w;)LM2/X$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public h(Lq2/C;)LM2/X;
    .locals 12

    .line 1
    iget-object v0, p1, Lq2/C;->b:Lq2/C$h;

    .line 2
    .line 3
    invoke-static {v0}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v1, LM2/X;

    .line 7
    .line 8
    iget-object v3, p0, LM2/X$b;->c:Lw2/g$a;

    .line 9
    .line 10
    iget-object v4, p0, LM2/X$b;->d:LM2/Q$a;

    .line 11
    .line 12
    iget-object v0, p0, LM2/X$b;->e:LF2/w;

    .line 13
    .line 14
    invoke-interface {v0, p1}, LF2/w;->a(Lq2/C;)LF2/u;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    iget-object v6, p0, LM2/X$b;->f:LQ2/k;

    .line 19
    .line 20
    iget v7, p0, LM2/X$b;->g:I

    .line 21
    .line 22
    iget v8, p0, LM2/X$b;->i:I

    .line 23
    .line 24
    iget-object v9, p0, LM2/X$b;->j:Lq2/x;

    .line 25
    .line 26
    iget-object v10, p0, LM2/X$b;->h:LO9/t;

    .line 27
    .line 28
    const/4 v11, 0x0

    .line 29
    move-object v2, p1

    .line 30
    invoke-direct/range {v1 .. v11}, LM2/X;-><init>(Lq2/C;Lw2/g$a;LM2/Q$a;LF2/u;LQ2/k;IILq2/x;LO9/t;LM2/X$a;)V

    .line 31
    .line 32
    .line 33
    return-object v1
.end method

.method i(ILq2/x;)LM2/X$b;
    .locals 0

    .line 1
    iput p1, p0, LM2/X$b;->i:I

    .line 2
    .line 3
    invoke-static {p2}, Lt2/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lq2/x;

    .line 8
    .line 9
    iput-object p1, p0, LM2/X$b;->j:Lq2/x;

    .line 10
    .line 11
    return-object p0
.end method

.method public j(LF2/w;)LM2/X$b;
    .locals 1

    .line 1
    const-string v0, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."

    .line 2
    .line 3
    invoke-static {p1, v0}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LF2/w;

    .line 8
    .line 9
    iput-object p1, p0, LM2/X$b;->e:LF2/w;

    .line 10
    .line 11
    return-object p0
.end method

.method public k(LQ2/k;)LM2/X$b;
    .locals 1

    .line 1
    const-string v0, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior."

    .line 2
    .line 3
    invoke-static {p1, v0}, Lt2/a;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LQ2/k;

    .line 8
    .line 9
    iput-object p1, p0, LM2/X$b;->f:LQ2/k;

    .line 10
    .line 11
    return-object p0
.end method
