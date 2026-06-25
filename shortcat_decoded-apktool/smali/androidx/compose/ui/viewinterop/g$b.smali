.class final Landroidx/compose/ui/viewinterop/g$b;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/compose/ui/viewinterop/g;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroidx/compose/ui/viewinterop/g;


# direct methods
.method constructor <init>(Landroidx/compose/ui/viewinterop/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/g$b;->a:Landroidx/compose/ui/viewinterop/g;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(Lq0/c;)V
    .locals 9

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/g$b;->a:Landroidx/compose/ui/viewinterop/g;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/compose/ui/viewinterop/f;->c(Landroidx/compose/ui/e$c;)Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-boolean v1, Ll0/h;->d:Z

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_8

    .line 22
    .line 23
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_8

    .line 32
    .line 33
    iget-object v1, p0, Landroidx/compose/ui/viewinterop/g$b;->a:Landroidx/compose/ui/viewinterop/g;

    .line 34
    .line 35
    invoke-static {v1}, LK0/k;->o(LK0/j;)LK0/p0;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-interface {v1}, LK0/p0;->getFocusOwner()Lq0/j;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    iget-object v2, p0, Landroidx/compose/ui/viewinterop/g$b;->a:Landroidx/compose/ui/viewinterop/g;

    .line 44
    .line 45
    invoke-static {v2}, LK0/l;->a(LK0/j;)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    instance-of v3, v0, Landroid/view/ViewGroup;

    .line 50
    .line 51
    const-string v4, "host view did not take focus"

    .line 52
    .line 53
    if-nez v3, :cond_3

    .line 54
    .line 55
    invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-eqz p1, :cond_2

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw p1

    .line 68
    :cond_3
    invoke-static {v1, v2, v0}, Landroidx/compose/ui/viewinterop/f;->b(Lq0/j;Landroid/view/View;Landroid/view/View;)Landroid/graphics/Rect;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-interface {p1}, Lq0/c;->b()I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    invoke-static {v3}, Landroidx/compose/ui/focus/f;->c(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    if-eqz v3, :cond_4

    .line 81
    .line 82
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    goto :goto_0

    .line 87
    :cond_4
    const/16 v3, 0x82

    .line 88
    .line 89
    :goto_0
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    iget-object v6, p0, Landroidx/compose/ui/viewinterop/g$b;->a:Landroidx/compose/ui/viewinterop/g;

    .line 94
    .line 95
    invoke-virtual {v6}, Landroidx/compose/ui/viewinterop/g;->F1()Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    const-string v8, "null cannot be cast to non-null type android.view.ViewGroup"

    .line 100
    .line 101
    if-eqz v7, :cond_5

    .line 102
    .line 103
    invoke-static {v2, v8}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    move-object v7, v2

    .line 107
    check-cast v7, Landroid/view/ViewGroup;

    .line 108
    .line 109
    invoke-virtual {v6}, Landroidx/compose/ui/viewinterop/g;->F1()Landroid/view/View;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    invoke-virtual {v5, v7, v6, v3}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    goto :goto_1

    .line 118
    :cond_5
    invoke-static {v2, v8}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    move-object v6, v2

    .line 122
    check-cast v6, Landroid/view/ViewGroup;

    .line 123
    .line 124
    invoke-virtual {v5, v6, v1, v3}, Landroid/view/FocusFinder;->findNextFocusFromRect(Landroid/view/ViewGroup;Landroid/graphics/Rect;I)Landroid/view/View;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    :goto_1
    if-eqz v5, :cond_6

    .line 129
    .line 130
    invoke-static {v0, v5}, Landroidx/compose/ui/viewinterop/f;->a(Landroid/view/View;Landroid/view/View;)Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-eqz v0, :cond_6

    .line 135
    .line 136
    invoke-virtual {v5, v3, v1}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z

    .line 137
    .line 138
    .line 139
    invoke-interface {p1}, Lq0/c;->a()V

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :cond_6
    invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z

    .line 144
    .line 145
    .line 146
    move-result p1

    .line 147
    if-eqz p1, :cond_7

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 151
    .line 152
    invoke-direct {p1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    throw p1

    .line 156
    :cond_8
    :goto_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq0/c;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/g$b;->a(Lq0/c;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, LTd/L;->a:LTd/L;

    .line 7
    .line 8
    return-object p1
.end method
