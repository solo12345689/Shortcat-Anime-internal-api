.class public LIc/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LIc/e;


# instance fields
.field private final a:Landroidx/core/app/q;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Landroidx/core/app/q;->i(Landroid/content/Context;)Landroidx/core/app/q;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, LIc/b;->a:Landroidx/core/app/q;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/CharSequence;Lqb/b;)Landroid/app/NotificationChannelGroup;
    .locals 0

    .line 1
    invoke-static {p1, p2}, Lr4/E;->a(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/app/NotificationChannelGroup;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1, p3}, LIc/b;->e(Ljava/lang/Object;Lqb/b;)V

    .line 6
    .line 7
    .line 8
    iget-object p2, p0, LIc/b;->a:Landroidx/core/app/q;

    .line 9
    .line 10
    invoke-virtual {p2, p1}, Landroidx/core/app/q;->f(Landroid/app/NotificationChannelGroup;)V

    .line 11
    .line 12
    .line 13
    return-object p1
.end method

.method public b()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LIc/b;->a:Landroidx/core/app/q;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/core/app/q;->n()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public c(Ljava/lang/String;)Landroid/app/NotificationChannelGroup;
    .locals 1

    .line 1
    iget-object v0, p0, LIc/b;->a:Landroidx/core/app/q;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/core/app/q;->m(Ljava/lang/String;)Landroid/app/NotificationChannelGroup;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public d(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, LIc/b;->a:Landroidx/core/app/q;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroidx/core/app/q;->h(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected e(Ljava/lang/Object;Lqb/b;)V
    .locals 2

    .line 1
    invoke-static {p1}, LIc/a;->a(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Landroidx/core/app/p;->a(Ljava/lang/Object;)Landroid/app/NotificationChannelGroup;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 12
    .line 13
    const/16 v1, 0x1c

    .line 14
    .line 15
    if-lt v0, v1, :cond_0

    .line 16
    .line 17
    const-string v0, "description"

    .line 18
    .line 19
    invoke-interface {p2, v0}, Lqb/b;->f(Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-interface {p2, v0}, Lqb/b;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-static {p1, p2}, Lr4/w;->a(Landroid/app/NotificationChannelGroup;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
.end method
