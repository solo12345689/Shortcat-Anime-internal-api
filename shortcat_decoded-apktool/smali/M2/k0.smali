.class public final LM2/k0;
.super LM2/w;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final f:Lq2/C;


# direct methods
.method public constructor <init>(Lq2/Y;Lq2/C;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LM2/w;-><init>(Lq2/Y;)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LM2/k0;->f:Lq2/C;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public s(ILq2/Y$d;J)Lq2/Y$d;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, LM2/w;->s(ILq2/Y$d;J)Lq2/Y$d;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, LM2/k0;->f:Lq2/C;

    .line 5
    .line 6
    iput-object p1, p2, Lq2/Y$d;->c:Lq2/C;

    .line 7
    .line 8
    iget-object p1, p1, Lq2/C;->b:Lq2/C$h;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    iget-object p1, p1, Lq2/C$h;->i:Ljava/lang/Object;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    :goto_0
    iput-object p1, p2, Lq2/Y$d;->b:Ljava/lang/Object;

    .line 17
    .line 18
    return-object p2
.end method
