.class public final LE/I$d;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LE/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE/I;-><init>(IILE/A;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:LE/I;


# direct methods
.method constructor <init>(LE/I;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE/I$d;->a:LE/I;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(I)Ljava/util/List;
    .locals 13

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Li0/l;->e:Li0/l$a;

    .line 7
    .line 8
    iget-object v2, p0, LE/I$d;->a:LE/I;

    .line 9
    .line 10
    invoke-virtual {v1}, Li0/l$a;->d()Li0/l;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    invoke-virtual {v3}, Li0/l;->g()Lkotlin/jvm/functions/Function1;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v4, 0x0

    .line 22
    :goto_0
    invoke-virtual {v1, v3}, Li0/l$a;->e(Li0/l;)Li0/l;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    :try_start_0
    invoke-static {v2}, LE/I;->g(LE/I;)LY/C0;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    invoke-interface {v6}, LY/C0;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v6

    .line 34
    check-cast v6, LE/u;

    .line 35
    .line 36
    invoke-virtual {v6}, LE/u;->o()Lkotlin/jvm/functions/Function1;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-interface {v6, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Ljava/util/List;

    .line 49
    .line 50
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    const/4 v7, 0x0

    .line 55
    :goto_1
    if-ge v7, v6, :cond_1

    .line 56
    .line 57
    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v8

    .line 61
    check-cast v8, Lkotlin/Pair;

    .line 62
    .line 63
    invoke-virtual {v2}, LE/I;->x()Landroidx/compose/foundation/lazy/layout/d;

    .line 64
    .line 65
    .line 66
    move-result-object v9

    .line 67
    invoke-virtual {v8}, Lkotlin/Pair;->c()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v10

    .line 71
    check-cast v10, Ljava/lang/Number;

    .line 72
    .line 73
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 74
    .line 75
    .line 76
    move-result v10

    .line 77
    invoke-virtual {v8}, Lkotlin/Pair;->d()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    check-cast v8, Li1/b;

    .line 82
    .line 83
    invoke-virtual {v8}, Li1/b;->r()J

    .line 84
    .line 85
    .line 86
    move-result-wide v11

    .line 87
    invoke-virtual {v9, v10, v11, v12}, Landroidx/compose/foundation/lazy/layout/d;->e(IJ)Landroidx/compose/foundation/lazy/layout/d$b;

    .line 88
    .line 89
    .line 90
    move-result-object v8

    .line 91
    invoke-interface {v0, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    add-int/lit8 v7, v7, 0x1

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :catchall_0
    move-exception p1

    .line 98
    goto :goto_2

    .line 99
    :cond_1
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    .line 101
    invoke-virtual {v1, v3, v5, v4}, Li0/l$a;->l(Li0/l;Li0/l;Lkotlin/jvm/functions/Function1;)V

    .line 102
    .line 103
    .line 104
    return-object v0

    .line 105
    :goto_2
    invoke-virtual {v1, v3, v5, v4}, Li0/l$a;->l(Li0/l;Li0/l;Lkotlin/jvm/functions/Function1;)V

    .line 106
    .line 107
    .line 108
    throw p1
.end method
