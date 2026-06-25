.class public final LY4/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY4/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY4/f$c;,
        LY4/f$a;,
        LY4/f$b;,
        LY4/f$e;,
        LY4/f$d;
    }
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:LY4/f$e;


# direct methods
.method constructor <init>(Landroid/content/Context;LY4/f$e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, LY4/f;->a:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, LY4/f;->b:LY4/f$e;

    .line 11
    .line 12
    return-void
.end method

.method public static c(Landroid/content/Context;)LY4/o;
    .locals 1

    .line 1
    new-instance v0, LY4/f$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LY4/f$a;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static e(Landroid/content/Context;)LY4/o;
    .locals 1

    .line 1
    new-instance v0, LY4/f$b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LY4/f$b;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static g(Landroid/content/Context;)LY4/o;
    .locals 1

    .line 1
    new-instance v0, LY4/f$c;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LY4/f$c;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LY4/f;->f(Ljava/lang/Integer;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic b(Ljava/lang/Object;IILS4/h;)LY4/n$a;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Integer;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, LY4/f;->d(Ljava/lang/Integer;IILS4/h;)LY4/n$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public d(Ljava/lang/Integer;IILS4/h;)LY4/n$a;
    .locals 3

    .line 1
    sget-object p2, Ld5/l;->b:LS4/g;

    .line 2
    .line 3
    invoke-virtual {p4, p2}, LS4/h;->c(LS4/g;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, Landroid/content/res/Resources$Theme;

    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2}, Landroid/content/res/Resources$Theme;->getResources()Landroid/content/res/Resources;

    .line 12
    .line 13
    .line 14
    move-result-object p3

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object p3, p0, LY4/f;->a:Landroid/content/Context;

    .line 17
    .line 18
    invoke-virtual {p3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    :goto_0
    new-instance p4, LY4/n$a;

    .line 23
    .line 24
    new-instance v0, Ln5/c;

    .line 25
    .line 26
    invoke-direct {v0, p1}, Ln5/c;-><init>(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    new-instance v1, LY4/f$d;

    .line 30
    .line 31
    iget-object v2, p0, LY4/f;->b:LY4/f$e;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-direct {v1, p2, p3, v2, p1}, LY4/f$d;-><init>(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;LY4/f$e;I)V

    .line 38
    .line 39
    .line 40
    invoke-direct {p4, v0, v1}, LY4/n$a;-><init>(LS4/f;Lcom/bumptech/glide/load/data/d;)V

    .line 41
    .line 42
    .line 43
    return-object p4
.end method

.method public f(Ljava/lang/Integer;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method
