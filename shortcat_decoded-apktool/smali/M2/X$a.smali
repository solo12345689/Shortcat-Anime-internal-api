.class LM2/X$a;
.super LM2/w;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM2/X;->E()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic f:LM2/X;


# direct methods
.method constructor <init>(LM2/X;Lq2/Y;)V
    .locals 0

    .line 1
    iput-object p1, p0, LM2/X$a;->f:LM2/X;

    .line 2
    .line 3
    invoke-direct {p0, p2}, LM2/w;-><init>(Lq2/Y;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public k(ILq2/Y$b;Z)Lq2/Y$b;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3}, LM2/w;->k(ILq2/Y$b;Z)Lq2/Y$b;

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p2, Lq2/Y$b;->f:Z

    .line 6
    .line 7
    return-object p2
.end method

.method public s(ILq2/Y$d;J)Lq2/Y$d;
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, LM2/w;->s(ILq2/Y$d;J)Lq2/Y$d;

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p2, Lq2/Y$d;->k:Z

    .line 6
    .line 7
    return-object p2
.end method
