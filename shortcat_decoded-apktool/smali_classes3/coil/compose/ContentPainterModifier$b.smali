.class public final Lcoil/compose/ContentPainterModifier$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcoil/compose/ContentPainterModifier;-><init>(Lw0/b;Ll0/e;LI0/f;FLandroidx/compose/ui/graphics/d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw0/b;

.field final synthetic b:Ll0/e;

.field final synthetic c:LI0/f;

.field final synthetic d:F

.field final synthetic e:Landroidx/compose/ui/graphics/d;


# direct methods
.method public constructor <init>(Lw0/b;Ll0/e;LI0/f;FLandroidx/compose/ui/graphics/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcoil/compose/ContentPainterModifier$b;->a:Lw0/b;

    .line 2
    .line 3
    iput-object p2, p0, Lcoil/compose/ContentPainterModifier$b;->b:Ll0/e;

    .line 4
    .line 5
    iput-object p3, p0, Lcoil/compose/ContentPainterModifier$b;->c:LI0/f;

    .line 6
    .line 7
    iput p4, p0, Lcoil/compose/ContentPainterModifier$b;->d:F

    .line 8
    .line 9
    iput-object p5, p0, Lcoil/compose/ContentPainterModifier$b;->e:Landroidx/compose/ui/graphics/d;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(Landroidx/compose/ui/platform/V0;)V
    .locals 3

    .line 1
    const-string v0, "$this$null"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "content"

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroidx/compose/ui/platform/V0;->d(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/compose/ui/platform/V0;->b()Landroidx/compose/ui/platform/x1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "painter"

    .line 16
    .line 17
    iget-object v2, p0, Lcoil/compose/ContentPainterModifier$b;->a:Lw0/b;

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/x1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Landroidx/compose/ui/platform/V0;->b()Landroidx/compose/ui/platform/x1;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v1, "alignment"

    .line 27
    .line 28
    iget-object v2, p0, Lcoil/compose/ContentPainterModifier$b;->b:Ll0/e;

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/x1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Landroidx/compose/ui/platform/V0;->b()Landroidx/compose/ui/platform/x1;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v1, "contentScale"

    .line 38
    .line 39
    iget-object v2, p0, Lcoil/compose/ContentPainterModifier$b;->c:LI0/f;

    .line 40
    .line 41
    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/platform/x1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Landroidx/compose/ui/platform/V0;->b()Landroidx/compose/ui/platform/x1;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget v1, p0, Lcoil/compose/ContentPainterModifier$b;->d:F

    .line 49
    .line 50
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const-string v2, "alpha"

    .line 55
    .line 56
    invoke-virtual {v0, v2, v1}, Landroidx/compose/ui/platform/x1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Landroidx/compose/ui/platform/V0;->b()Landroidx/compose/ui/platform/x1;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    const-string v0, "colorFilter"

    .line 64
    .line 65
    iget-object v1, p0, Lcoil/compose/ContentPainterModifier$b;->e:Landroidx/compose/ui/graphics/d;

    .line 66
    .line 67
    invoke-virtual {p1, v0, v1}, Landroidx/compose/ui/platform/x1;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Landroidx/compose/ui/platform/V0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcoil/compose/ContentPainterModifier$b;->a(Landroidx/compose/ui/platform/V0;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LTd/L;->a:LTd/L;

    .line 7
    .line 8
    return-object p1
.end method
