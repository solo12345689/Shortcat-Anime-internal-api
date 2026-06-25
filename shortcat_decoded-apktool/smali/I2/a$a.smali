.class LI2/a$a;
.super LI2/d;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LI2/a;->z()LI2/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic f:LI2/a;


# direct methods
.method constructor <init>(LI2/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LI2/a$a;->f:LI2/a;

    .line 2
    .line 3
    invoke-direct {p0}, LI2/d;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public w()V
    .locals 1

    .line 1
    iget-object v0, p0, LI2/a$a;->f:LI2/a;

    .line 2
    .line 3
    invoke-static {v0, p0}, LI2/a;->y(LI2/a;Lz2/g;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
