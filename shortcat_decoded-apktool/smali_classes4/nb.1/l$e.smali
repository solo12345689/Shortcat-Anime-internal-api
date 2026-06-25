.class public final Lnb/l$e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnb/l;->n()Lgc/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lnb/l;


# direct methods
.method public constructor <init>(Lnb/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnb/l$e;->a:Lnb/l;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    const-string v0, "<destruct>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    aget-object p1, p1, v0

    .line 8
    .line 9
    check-cast p1, Lexpo/modules/clipboard/GetStringOptions;

    .line 10
    .line 11
    iget-object v0, p0, Lnb/l$e;->a:Lnb/l;

    .line 12
    .line 13
    invoke-static {v0}, Lnb/l;->B(Lnb/l;)Landroid/content/ClipboardManager;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v0, v1}, Lnb/l;->D(Lnb/l;Landroid/content/ClipboardManager;)Landroid/content/ClipData$Item;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p1}, Lexpo/modules/clipboard/GetStringOptions;->getPreferredFormat()Lexpo/modules/clipboard/StringFormat;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    sget-object v1, Lnb/l$b;->a:[I

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    aget p1, v1, p1

    .line 32
    .line 33
    const/4 v1, 0x1

    .line 34
    const/4 v2, 0x0

    .line 35
    if-eq p1, v1, :cond_1

    .line 36
    .line 37
    const/4 v1, 0x2

    .line 38
    if-ne p1, v1, :cond_0

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    iget-object p1, p0, Lnb/l$e;->a:Lnb/l;

    .line 43
    .line 44
    invoke-static {p1}, Lnb/l;->C(Lnb/l;)Landroid/content/Context;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {v0, p1}, Landroid/content/ClipData$Item;->coerceToHtmlText(Landroid/content/Context;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    new-instance p1, LTd/r;

    .line 54
    .line 55
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_1
    if-eqz v0, :cond_2

    .line 60
    .line 61
    iget-object p1, p0, Lnb/l$e;->a:Lnb/l;

    .line 62
    .line 63
    invoke-static {p1}, Lnb/l;->C(Lnb/l;)Landroid/content/Context;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-static {v0, p1}, Lnb/m;->a(Landroid/content/ClipData$Item;Landroid/content/Context;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    :cond_2
    :goto_0
    if-nez v2, :cond_3

    .line 72
    .line 73
    const-string p1, ""

    .line 74
    .line 75
    return-object p1

    .line 76
    :cond_3
    return-object v2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lnb/l$e;->a([Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
