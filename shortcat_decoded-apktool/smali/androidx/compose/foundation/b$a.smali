.class public final Landroidx/compose/foundation/b$a;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/foundation/b;->a(Landroidx/compose/ui/e;Ls0/h0;Ls0/E1;F)Landroidx/compose/ui/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:Ls0/h0;

.field final synthetic c:Ls0/E1;


# direct methods
.method public constructor <init>(FLs0/h0;Ls0/E1;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/compose/foundation/b$a;->a:F

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/foundation/b$a;->b:Ls0/h0;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/compose/foundation/b$a;->c:Ls0/E1;

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
    const-string v0, "background"

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
    iget v1, p0, Landroidx/compose/foundation/b$a;->a:F

    .line 11
    .line 12
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const-string v2, "alpha"

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
    const-string v1, "brush"

    .line 26
    .line 27
    iget-object v2, p0, Landroidx/compose/foundation/b$a;->b:Ls0/h0;

    .line 28
    .line 29
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/x1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Landroidx/compose/ui/platform/V0;->b()Landroidx/compose/ui/platform/x1;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    const-string v0, "shape"

    .line 37
    .line 38
    iget-object v1, p0, Landroidx/compose/foundation/b$a;->c:Ls0/E1;

    .line 39
    .line 40
    invoke-virtual {p1, v0, v1}, Landroidx/compose/ui/platform/x1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/platform/V0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/b$a;->a(Landroidx/compose/ui/platform/V0;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LTd/L;->a:LTd/L;

    .line 7
    .line 8
    return-object p1
.end method
