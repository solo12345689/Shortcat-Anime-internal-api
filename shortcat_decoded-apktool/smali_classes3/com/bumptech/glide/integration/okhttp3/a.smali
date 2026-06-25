.class public Lcom/bumptech/glide/integration/okhttp3/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LY4/n;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bumptech/glide/integration/okhttp3/a$a;
    }
.end annotation


# instance fields
.field private final a:Ldg/e$a;


# direct methods
.method public constructor <init>(Ldg/e$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/bumptech/glide/integration/okhttp3/a;->a:Ldg/e$a;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, LY4/h;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/integration/okhttp3/a;->d(LY4/h;)Z

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
    check-cast p1, LY4/h;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/bumptech/glide/integration/okhttp3/a;->c(LY4/h;IILS4/h;)LY4/n$a;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public c(LY4/h;IILS4/h;)LY4/n$a;
    .locals 0

    .line 1
    new-instance p2, LY4/n$a;

    .line 2
    .line 3
    new-instance p3, LR4/a;

    .line 4
    .line 5
    iget-object p4, p0, Lcom/bumptech/glide/integration/okhttp3/a;->a:Ldg/e$a;

    .line 6
    .line 7
    invoke-direct {p3, p4, p1}, LR4/a;-><init>(Ldg/e$a;LY4/h;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p2, p1, p3}, LY4/n$a;-><init>(LS4/f;Lcom/bumptech/glide/load/data/d;)V

    .line 11
    .line 12
    .line 13
    return-object p2
.end method

.method public d(LY4/h;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
.end method
