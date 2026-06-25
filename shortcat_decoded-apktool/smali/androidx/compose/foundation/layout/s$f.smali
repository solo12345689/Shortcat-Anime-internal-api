.class public final Landroidx/compose/foundation/layout/s$f;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/layout/s;->o(Landroidx/compose/ui/e;FFFF)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:F

.field final synthetic c:F

.field final synthetic d:F


# direct methods
.method public constructor <init>(FFFF)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/compose/foundation/layout/s$f;->a:F

    .line 2
    .line 3
    iput p2, p0, Landroidx/compose/foundation/layout/s$f;->b:F

    .line 4
    .line 5
    iput p3, p0, Landroidx/compose/foundation/layout/s$f;->c:F

    .line 6
    .line 7
    iput p4, p0, Landroidx/compose/foundation/layout/s$f;->d:F

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/platform/V0;)V
    .locals 3

    .line 1
    const-string v0, "requiredSizeIn"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroidx/compose/ui/platform/V0;->d(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/compose/ui/platform/V0;->b()Landroidx/compose/ui/platform/x1;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget v1, p0, Landroidx/compose/foundation/layout/s$f;->a:F

    .line 11
    .line 12
    invoke-static {v1}, Li1/h;->h(F)Li1/h;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "minWidth"

    .line 17
    .line 18
    invoke-virtual {v0, v2, v1}, Landroidx/compose/ui/platform/x1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Landroidx/compose/ui/platform/V0;->b()Landroidx/compose/ui/platform/x1;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget v1, p0, Landroidx/compose/foundation/layout/s$f;->b:F

    .line 26
    .line 27
    invoke-static {v1}, Li1/h;->h(F)Li1/h;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-string v2, "minHeight"

    .line 32
    .line 33
    invoke-virtual {v0, v2, v1}, Landroidx/compose/ui/platform/x1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Landroidx/compose/ui/platform/V0;->b()Landroidx/compose/ui/platform/x1;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iget v1, p0, Landroidx/compose/foundation/layout/s$f;->c:F

    .line 41
    .line 42
    invoke-static {v1}, Li1/h;->h(F)Li1/h;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    const-string v2, "maxWidth"

    .line 47
    .line 48
    invoke-virtual {v0, v2, v1}, Landroidx/compose/ui/platform/x1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Landroidx/compose/ui/platform/V0;->b()Landroidx/compose/ui/platform/x1;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iget v0, p0, Landroidx/compose/foundation/layout/s$f;->d:F

    .line 56
    .line 57
    invoke-static {v0}, Li1/h;->h(F)Li1/h;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-string v1, "maxHeight"

    .line 62
    .line 63
    invoke-virtual {p1, v1, v0}, Landroidx/compose/ui/platform/x1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/platform/V0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/s$f;->a(Landroidx/compose/ui/platform/V0;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LTd/L;->a:LTd/L;

    .line 7
    .line 8
    return-object p1
.end method
