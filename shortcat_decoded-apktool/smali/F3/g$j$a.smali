.class LF3/g$j$a;
.super LF3/g$l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF3/g$j;->i(Ljava/lang/String;LF3/g$m;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic f:LF3/g$m;

.field final synthetic g:Landroid/os/Bundle;

.field final synthetic h:LF3/g$j;


# direct methods
.method constructor <init>(LF3/g$j;Ljava/lang/Object;LF3/g$m;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF3/g$j$a;->h:LF3/g$j;

    .line 2
    .line 3
    iput-object p3, p0, LF3/g$j$a;->f:LF3/g$m;

    .line 4
    .line 5
    iput-object p4, p0, LF3/g$j$a;->g:Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-direct {p0, p2}, LF3/g$l;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method bridge synthetic d(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/util/List;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LF3/g$j$a;->h(Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method h(Ljava/util/List;)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    iget-object p1, p0, LF3/g$j$a;->f:LF3/g$m;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p1, v0}, LF3/g$m;->b(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {p0}, LF3/g$l;->a()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    and-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, LF3/g$j$a;->h:LF3/g$j;

    .line 19
    .line 20
    iget-object v0, v0, LF3/g$j;->f:LF3/g;

    .line 21
    .line 22
    iget-object v1, p0, LF3/g$j$a;->g:Landroid/os/Bundle;

    .line 23
    .line 24
    invoke-virtual {v0, p1, v1}, LF3/g;->b(Ljava/util/List;Landroid/os/Bundle;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    if-nez p1, :cond_2

    .line 32
    .line 33
    move v2, v1

    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    :goto_0
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 40
    .line 41
    .line 42
    if-eqz p1, :cond_3

    .line 43
    .line 44
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_3

    .line 53
    .line 54
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, LF3/e$h;

    .line 59
    .line 60
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v2, v3, v1}, LF3/e$h;->writeToParcel(Landroid/os/Parcel;I)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    iget-object p1, p0, LF3/g$j$a;->f:LF3/g$m;

    .line 72
    .line 73
    invoke-virtual {p1, v0}, LF3/g$m;->b(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    return-void
.end method
