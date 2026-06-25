.class public LY4/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY4/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY4/b$b;,
        LY4/b$c;,
        LY4/b$d;,
        LY4/b$a;
    }
.end annotation


# instance fields
.field private final a:LY4/b$b;


# direct methods
.method public constructor <init>(LY4/b$b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LY4/b;->a:LY4/b$b;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, [B

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LY4/b;->d([B)Z

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
    check-cast p1, [B

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, LY4/b;->c([BIILS4/h;)LY4/n$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c([BIILS4/h;)LY4/n$a;
    .locals 1

    .line 1
    new-instance p2, LY4/n$a;

    .line 2
    .line 3
    new-instance p3, Ln5/c;

    .line 4
    .line 5
    invoke-direct {p3, p1}, Ln5/c;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance p4, LY4/b$c;

    .line 9
    .line 10
    iget-object v0, p0, LY4/b;->a:LY4/b$b;

    .line 11
    .line 12
    invoke-direct {p4, p1, v0}, LY4/b$c;-><init>([BLY4/b$b;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p2, p3, p4}, LY4/n$a;-><init>(LS4/f;Lcom/bumptech/glide/load/data/d;)V

    .line 16
    .line 17
    .line 18
    return-object p2
.end method

.method public d([B)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method
