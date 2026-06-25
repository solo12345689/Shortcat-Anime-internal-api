.class public final LQe/s$d;
.super LQe/s;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQe/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field private final j:Lgf/e;


# direct methods
.method public constructor <init>(Lgf/e;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, LQe/s;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, LQe/s$d;->j:Lgf/e;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final i()Lgf/e;
    .locals 1

    .line 1
    iget-object v0, p0, LQe/s$d;->j:Lgf/e;

    .line 2
    .line 3
    return-object v0
.end method
