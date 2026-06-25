.class final Landroidx/compose/animation/f$d;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/animation/f;->e(Lw/o0;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Ljava/lang/String;LY/m;I)Lv/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/animation/f$d$a;
    }
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/animation/h;

.field final synthetic b:Landroidx/compose/animation/j;


# direct methods
.method constructor <init>(Landroidx/compose/animation/h;Landroidx/compose/animation/j;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/f$d;->a:Landroidx/compose/animation/h;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/animation/f$d;->b:Landroidx/compose/animation/j;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(Lv/l;)Ljava/lang/Float;
    .locals 2

    .line 1
    sget-object v0, Landroidx/compose/animation/f$d$a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/high16 v1, 0x3f800000    # 1.0f

    .line 11
    .line 12
    if-eq p1, v0, :cond_2

    .line 13
    .line 14
    const/4 v0, 0x2

    .line 15
    if-eq p1, v0, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    if-ne p1, v0, :cond_0

    .line 19
    .line 20
    iget-object p1, p0, Landroidx/compose/animation/f$d;->b:Landroidx/compose/animation/j;

    .line 21
    .line 22
    invoke-virtual {p1}, Landroidx/compose/animation/j;->b()Lv/B;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Lv/B;->c()Lv/n;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    if-eqz p1, :cond_2

    .line 31
    .line 32
    invoke-virtual {p1}, Lv/n;->a()F

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance p1, LTd/r;

    .line 38
    .line 39
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 40
    .line 41
    .line 42
    throw p1

    .line 43
    :cond_1
    iget-object p1, p0, Landroidx/compose/animation/f$d;->a:Landroidx/compose/animation/h;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroidx/compose/animation/h;->b()Lv/B;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p1}, Lv/B;->c()Lv/n;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    invoke-virtual {p1}, Lv/n;->a()F

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    :cond_2
    :goto_0
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lv/l;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/compose/animation/f$d;->a(Lv/l;)Ljava/lang/Float;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
