.class final LU/d$s;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU/d;->m(FFFLY/m;II)LU/n0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:F

.field final synthetic c:F


# direct methods
.method constructor <init>(FFF)V
    .locals 0

    .line 1
    iput p1, p0, LU/d$s;->a:F

    .line 2
    .line 3
    iput p2, p0, LU/d$s;->b:F

    .line 4
    .line 5
    iput p3, p0, LU/d$s;->c:F

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()LU/n0;
    .locals 4

    .line 1
    new-instance v0, LU/n0;

    .line 2
    .line 3
    iget v1, p0, LU/d$s;->a:F

    .line 4
    .line 5
    iget v2, p0, LU/d$s;->b:F

    .line 6
    .line 7
    iget v3, p0, LU/d$s;->c:F

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3}, LU/n0;-><init>(FFF)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LU/d$s;->a()LU/n0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
