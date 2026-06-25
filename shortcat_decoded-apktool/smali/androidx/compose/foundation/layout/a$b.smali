.class public final Landroidx/compose/foundation/layout/a$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/layout/a;->e(Landroidx/compose/ui/e;LI0/a;FF)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LI0/a;

.field final synthetic b:F

.field final synthetic c:F


# direct methods
.method public constructor <init>(LI0/a;FF)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/foundation/layout/a$b;->a:LI0/a;

    .line 2
    .line 3
    iput p2, p0, Landroidx/compose/foundation/layout/a$b;->b:F

    .line 4
    .line 5
    iput p3, p0, Landroidx/compose/foundation/layout/a$b;->c:F

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/platform/V0;)V
    .locals 3

    .line 1
    const-string v0, "paddingFrom"

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
    const-string v1, "alignmentLine"

    .line 11
    .line 12
    iget-object v2, p0, Landroidx/compose/foundation/layout/a$b;->a:LI0/a;

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/x1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroidx/compose/ui/platform/V0;->b()Landroidx/compose/ui/platform/x1;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget v1, p0, Landroidx/compose/foundation/layout/a$b;->b:F

    .line 22
    .line 23
    invoke-static {v1}, Li1/h;->h(F)Li1/h;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string v2, "before"

    .line 28
    .line 29
    invoke-virtual {v0, v2, v1}, Landroidx/compose/ui/platform/x1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Landroidx/compose/ui/platform/V0;->b()Landroidx/compose/ui/platform/x1;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget v0, p0, Landroidx/compose/foundation/layout/a$b;->c:F

    .line 37
    .line 38
    invoke-static {v0}, Li1/h;->h(F)Li1/h;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v1, "after"

    .line 43
    .line 44
    invoke-virtual {p1, v1, v0}, Landroidx/compose/ui/platform/x1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/platform/V0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/a$b;->a(Landroidx/compose/ui/platform/V0;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LTd/L;->a:LTd/L;

    .line 7
    .line 8
    return-object p1
.end method
