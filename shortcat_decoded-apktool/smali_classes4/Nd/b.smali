.class public abstract LNd/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# direct methods
.method public static final synthetic a()Landroidx/browser/customtabs/d;
    .locals 1

    .line 1
    invoke-static {}, LNd/b;->c()Landroidx/browser/customtabs/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static final synthetic b()Landroid/content/Intent;
    .locals 1

    .line 1
    invoke-static {}, LNd/b;->d()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private static final c()Landroidx/browser/customtabs/d;
    .locals 3

    .line 1
    new-instance v0, Landroidx/browser/customtabs/d$d;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/browser/customtabs/d$d;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroidx/browser/customtabs/d$d;->a()Landroidx/browser/customtabs/d;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "build(...)"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iget-object v1, v0, Landroidx/browser/customtabs/d;->a:Landroid/content/Intent;

    .line 16
    .line 17
    const-string v2, "https://expo.dev"

    .line 18
    .line 19
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method private static final d()Landroid/content/Intent;
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "android.support.customtabs.action.CustomTabsService"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
