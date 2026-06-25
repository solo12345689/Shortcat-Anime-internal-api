.class public final synthetic Lcom/revenuecat/purchases/ui/revenuecatui/components/stickyfooter/StickyFooterComponentViewKt;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aM\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\t\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u00042\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StickyFooterComponentStyle;",
        "style",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;",
        "state",
        "Lkotlin/Function2;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/components/PaywallAction;",
        "LZd/e;",
        "LTd/L;",
        "",
        "clickHandler",
        "Landroidx/compose/ui/e;",
        "modifier",
        "StickyFooterComponentView",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StickyFooterComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;LY/m;II)V",
        "revenuecatui_defaultsBc8Release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final StickyFooterComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StickyFooterComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;LY/m;II)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StickyFooterComponentStyle;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;",
            "Lkotlin/jvm/functions/Function2;",
            "Landroidx/compose/ui/e;",
            "LY/m;",
            "II)V"
        }
    .end annotation

    .line 1
    const-string v0, "style"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "state"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "clickHandler"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const v0, -0x79b6383

    .line 17
    .line 18
    .line 19
    invoke-interface {p4, v0}, LY/m;->g(I)LY/m;

    .line 20
    .line 21
    .line 22
    move-result-object v6

    .line 23
    and-int/lit8 p4, p6, 0x1

    .line 24
    .line 25
    if-eqz p4, :cond_0

    .line 26
    .line 27
    or-int/lit8 p4, p5, 0x6

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    and-int/lit8 p4, p5, 0x6

    .line 31
    .line 32
    if-nez p4, :cond_2

    .line 33
    .line 34
    invoke-interface {v6, p0}, LY/m;->U(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result p4

    .line 38
    if-eqz p4, :cond_1

    .line 39
    .line 40
    const/4 p4, 0x4

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const/4 p4, 0x2

    .line 43
    :goto_0
    or-int/2addr p4, p5

    .line 44
    goto :goto_1

    .line 45
    :cond_2
    move p4, p5

    .line 46
    :goto_1
    and-int/lit8 v1, p6, 0x2

    .line 47
    .line 48
    if-eqz v1, :cond_3

    .line 49
    .line 50
    or-int/lit8 p4, p4, 0x30

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_3
    and-int/lit8 v1, p5, 0x30

    .line 54
    .line 55
    if-nez v1, :cond_5

    .line 56
    .line 57
    invoke-interface {v6, p1}, LY/m;->U(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    const/16 v1, 0x20

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_4
    const/16 v1, 0x10

    .line 67
    .line 68
    :goto_2
    or-int/2addr p4, v1

    .line 69
    :cond_5
    :goto_3
    and-int/lit8 v1, p6, 0x4

    .line 70
    .line 71
    if-eqz v1, :cond_6

    .line 72
    .line 73
    or-int/lit16 p4, p4, 0x180

    .line 74
    .line 75
    goto :goto_5

    .line 76
    :cond_6
    and-int/lit16 v1, p5, 0x180

    .line 77
    .line 78
    if-nez v1, :cond_8

    .line 79
    .line 80
    invoke-interface {v6, p2}, LY/m;->F(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-eqz v1, :cond_7

    .line 85
    .line 86
    const/16 v1, 0x100

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_7
    const/16 v1, 0x80

    .line 90
    .line 91
    :goto_4
    or-int/2addr p4, v1

    .line 92
    :cond_8
    :goto_5
    and-int/lit8 v1, p6, 0x8

    .line 93
    .line 94
    if-eqz v1, :cond_9

    .line 95
    .line 96
    or-int/lit16 p4, p4, 0xc00

    .line 97
    .line 98
    goto :goto_7

    .line 99
    :cond_9
    and-int/lit16 v2, p5, 0xc00

    .line 100
    .line 101
    if-nez v2, :cond_b

    .line 102
    .line 103
    invoke-interface {v6, p3}, LY/m;->U(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_a

    .line 108
    .line 109
    const/16 v2, 0x800

    .line 110
    .line 111
    goto :goto_6

    .line 112
    :cond_a
    const/16 v2, 0x400

    .line 113
    .line 114
    :goto_6
    or-int/2addr p4, v2

    .line 115
    :cond_b
    :goto_7
    and-int/lit16 v2, p4, 0x493

    .line 116
    .line 117
    const/16 v3, 0x492

    .line 118
    .line 119
    if-ne v2, v3, :cond_d

    .line 120
    .line 121
    invoke-interface {v6}, LY/m;->i()Z

    .line 122
    .line 123
    .line 124
    move-result v2

    .line 125
    if-nez v2, :cond_c

    .line 126
    .line 127
    goto :goto_8

    .line 128
    :cond_c
    invoke-interface {v6}, LY/m;->K()V

    .line 129
    .line 130
    .line 131
    move-object p4, p3

    .line 132
    move-object p3, p2

    .line 133
    move-object p2, p1

    .line 134
    goto :goto_9

    .line 135
    :cond_d
    :goto_8
    if-eqz v1, :cond_e

    .line 136
    .line 137
    sget-object p3, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 138
    .line 139
    :cond_e
    move-object v4, p3

    .line 140
    invoke-static {}, LY/w;->L()Z

    .line 141
    .line 142
    .line 143
    move-result p3

    .line 144
    if-eqz p3, :cond_f

    .line 145
    .line 146
    const/4 p3, -0x1

    .line 147
    const-string v1, "com.revenuecat.purchases.ui.revenuecatui.components.stickyfooter.StickyFooterComponentView (StickyFooterComponentView.kt:17)"

    .line 148
    .line 149
    invoke-static {v0, p4, p3, v1}, LY/w;->U(IIILjava/lang/String;)V

    .line 150
    .line 151
    .line 152
    :cond_f
    invoke-virtual {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StickyFooterComponentStyle;->getStackComponentStyle()Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    and-int/lit16 v7, p4, 0x1ff0

    .line 157
    .line 158
    const/16 v8, 0x10

    .line 159
    .line 160
    const/4 v5, 0x0

    .line 161
    move-object v2, p1

    .line 162
    move-object v3, p2

    .line 163
    invoke-static/range {v1 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stack/StackComponentViewKt;->StackComponentView(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StackComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;FLY/m;II)V

    .line 164
    .line 165
    .line 166
    move-object p2, v2

    .line 167
    move-object p3, v3

    .line 168
    invoke-static {}, LY/w;->L()Z

    .line 169
    .line 170
    .line 171
    move-result p1

    .line 172
    if-eqz p1, :cond_10

    .line 173
    .line 174
    invoke-static {}, LY/w;->T()V

    .line 175
    .line 176
    .line 177
    :cond_10
    move-object p4, v4

    .line 178
    :goto_9
    invoke-interface {v6}, LY/m;->k()LY/B1;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    if-eqz v0, :cond_11

    .line 183
    .line 184
    move-object p1, p0

    .line 185
    new-instance p0, Lcom/revenuecat/purchases/ui/revenuecatui/components/stickyfooter/StickyFooterComponentViewKt$StickyFooterComponentView$1;

    .line 186
    .line 187
    invoke-direct/range {p0 .. p6}, Lcom/revenuecat/purchases/ui/revenuecatui/components/stickyfooter/StickyFooterComponentViewKt$StickyFooterComponentView$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/components/style/StickyFooterComponentStyle;Lcom/revenuecat/purchases/ui/revenuecatui/data/PaywallState$Loaded$Components;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/e;II)V

    .line 188
    .line 189
    .line 190
    invoke-interface {v0, p0}, LY/B1;->a(Lkotlin/jvm/functions/Function2;)V

    .line 191
    .line 192
    .line 193
    :cond_11
    return-void
.end method
