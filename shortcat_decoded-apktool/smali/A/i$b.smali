.class final LA/i$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA/i;->f(Lz/u;FLw/k;Lw/z;Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;
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
    iput p1, p0, LA/i$b;->a:F

    .line 2
    .line 3
    iput-object p2, p0, LA/i$b;->b:Lkotlin/jvm/internal/K;

    .line 4
    .line 5
    iput-object p3, p0, LA/i$b;->c:Lz/u;

    .line 6
    .line 7
    iput-object p4, p0, LA/i$b;->d:Lkotlin/jvm/functions/Function1;

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
    .locals 4

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
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget v1, p0, LA/i$b;->a:F

    .line 16
    .line 17
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    cmpl-float v0, v0, v1

    .line 22
    .line 23
    if-ltz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1}, Lw/h;->e()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Ljava/lang/Number;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iget v1, p0, LA/i$b;->a:F

    .line 36
    .line 37
    invoke-static {v0, v1}, LA/i;->e(FF)F

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iget-object v1, p0, LA/i$b;->b:Lkotlin/jvm/internal/K;

    .line 42
    .line 43
    iget v1, v1, Lkotlin/jvm/internal/K;->a:F

    .line 44
    .line 45
    sub-float v1, v0, v1

    .line 46
    .line 47
    iget-object v2, p0, LA/i$b;->c:Lz/u;

    .line 48
    .line 49
    iget-object v3, p0, LA/i$b;->d:Lkotlin/jvm/functions/Function1;

    .line 50
    .line 51
    invoke-static {p1, v2, v3, v1}, LA/i;->b(Lw/h;Lz/u;Lkotlin/jvm/functions/Function1;F)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Lw/h;->a()V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, LA/i$b;->b:Lkotlin/jvm/internal/K;

    .line 58
    .line 59
    iput v0, p1, Lkotlin/jvm/internal/K;->a:F

    .line 60
    .line 61
    return-void

    .line 62
    :cond_0
    invoke-virtual {p1}, Lw/h;->e()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    check-cast v0, Ljava/lang/Number;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    iget-object v1, p0, LA/i$b;->b:Lkotlin/jvm/internal/K;

    .line 73
    .line 74
    iget v1, v1, Lkotlin/jvm/internal/K;->a:F

    .line 75
    .line 76
    sub-float/2addr v0, v1

    .line 77
    iget-object v1, p0, LA/i$b;->c:Lz/u;

    .line 78
    .line 79
    iget-object v2, p0, LA/i$b;->d:Lkotlin/jvm/functions/Function1;

    .line 80
    .line 81
    invoke-static {p1, v1, v2, v0}, LA/i;->b(Lw/h;Lz/u;Lkotlin/jvm/functions/Function1;F)V

    .line 82
    .line 83
    .line 84
    iget-object v0, p0, LA/i$b;->b:Lkotlin/jvm/internal/K;

    .line 85
    .line 86
    invoke-virtual {p1}, Lw/h;->e()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    check-cast p1, Ljava/lang/Number;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    iput p1, v0, Lkotlin/jvm/internal/K;->a:F

    .line 97
    .line 98
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lw/h;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LA/i$b;->a(Lw/h;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LTd/L;->a:LTd/L;

    .line 7
    .line 8
    return-object p1
.end method
