.class final LA/i$d;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA/i;->h(Lz/u;FFLw/k;Lw/i;Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:F

.field final synthetic b:Lkotlin/jvm/internal/K;

.field final synthetic c:Lz/u;

.field final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method constructor <init>(FLkotlin/jvm/internal/K;Lz/u;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    iput p1, p0, LA/i$d;->a:F

    .line 2
    .line 3
    iput-object p2, p0, LA/i$d;->b:Lkotlin/jvm/internal/K;

    .line 4
    .line 5
    iput-object p3, p0, LA/i$d;->c:Lz/u;

    .line 6
    .line 7
    iput-object p4, p0, LA/i$d;->d:Lkotlin/jvm/functions/Function1;

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
.method public final a(Lw/h;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Lw/h;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget v1, p0, LA/i$d;->a:F

    .line 12
    .line 13
    invoke-static {v0, v1}, LA/i;->e(FF)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v1, p0, LA/i$d;->b:Lkotlin/jvm/internal/K;

    .line 18
    .line 19
    iget v1, v1, Lkotlin/jvm/internal/K;->a:F

    .line 20
    .line 21
    sub-float v1, v0, v1

    .line 22
    .line 23
    iget-object v2, p0, LA/i$d;->c:Lz/u;

    .line 24
    .line 25
    invoke-interface {v2, v1}, Lz/u;->a(F)F

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    iget-object v3, p0, LA/i$d;->d:Lkotlin/jvm/functions/Function1;

    .line 30
    .line 31
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-interface {v3, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    sub-float/2addr v1, v2

    .line 39
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/high16 v3, 0x3f000000    # 0.5f

    .line 44
    .line 45
    cmpl-float v1, v1, v3

    .line 46
    .line 47
    if-gtz v1, :cond_0

    .line 48
    .line 49
    invoke-virtual {p1}, Lw/h;->e()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Ljava/lang/Number;

    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    cmpg-float v0, v0, v1

    .line 60
    .line 61
    if-nez v0, :cond_0

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    invoke-virtual {p1}, Lw/h;->a()V

    .line 65
    .line 66
    .line 67
    :goto_0
    iget-object p1, p0, LA/i$d;->b:Lkotlin/jvm/internal/K;

    .line 68
    .line 69
    iget v0, p1, Lkotlin/jvm/internal/K;->a:F

    .line 70
    .line 71
    add-float/2addr v0, v2

    .line 72
    iput v0, p1, Lkotlin/jvm/internal/K;->a:F

    .line 73
    .line 74
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lw/h;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LA/i$d;->a(Lw/h;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LTd/L;->a:LTd/L;

    .line 7
    .line 8
    return-object p1
.end method
