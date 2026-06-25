.class Ln4/w$m;
.super LM3/w;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln4/w;-><init>(LM3/q;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Ln4/w;


# direct methods
.method constructor <init>(Ln4/w;LM3/q;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ln4/w$m;->d:Ln4/w;

    .line 2
    .line 3
    invoke-direct {p0, p2}, LM3/w;-><init>(LM3/q;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public e()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "UPDATE workspec SET run_attempt_count=0 WHERE id=?"

    .line 2
    .line 3
    return-object v0
.end method
