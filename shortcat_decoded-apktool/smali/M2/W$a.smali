.class LM2/W$a;
.super LU2/A;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM2/W;->T()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:LM2/W;


# direct methods
.method constructor <init>(LM2/W;LU2/J;)V
    .locals 0

    .line 1
    iput-object p1, p0, LM2/W$a;->b:LM2/W;

    .line 2
    .line 3
    invoke-direct {p0, p2}, LU2/A;-><init>(LU2/J;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public n()J
    .locals 2

    .line 1
    iget-object v0, p0, LM2/W$a;->b:LM2/W;

    .line 2
    .line 3
    invoke-static {v0}, LM2/W;->G(LM2/W;)J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method
