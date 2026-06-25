.class public final LCd/e$k;
.super LCd/e;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LCd/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "k"
.end annotation


# instance fields
.field private final b:D


# direct methods
.method public constructor <init>(D)V
    .locals 2

    .line 1
    sget-object v0, LCd/f;->i:LCd/f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {p0, v0, v1}, LCd/e;-><init>(LCd/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    iput-wide p1, p0, LCd/e$k;->b:D

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final b()D
    .locals 2

    .line 1
    iget-wide v0, p0, LCd/e$k;->b:D

    .line 2
    .line 3
    return-wide v0
.end method
