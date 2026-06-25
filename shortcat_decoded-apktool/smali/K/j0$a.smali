.class final LK/j0$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LK/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private a:LK/j0$a;

.field private b:La1/U;


# direct methods
.method public constructor <init>(LK/j0$a;La1/U;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LK/j0$a;->a:LK/j0$a;

    .line 5
    .line 6
    iput-object p2, p0, LK/j0$a;->b:La1/U;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()LK/j0$a;
    .locals 1

    .line 1
    iget-object v0, p0, LK/j0$a;->a:LK/j0$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()La1/U;
    .locals 1

    .line 1
    iget-object v0, p0, LK/j0$a;->b:La1/U;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(LK/j0$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/j0$a;->a:LK/j0$a;

    .line 2
    .line 3
    return-void
.end method

.method public final d(La1/U;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK/j0$a;->b:La1/U;

    .line 2
    .line 3
    return-void
.end method
