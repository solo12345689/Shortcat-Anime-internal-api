.class public abstract Lsg/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field private static final a:Ltg/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Ltg/k;->d:Ltg/k$a;

    .line 2
    .line 3
    const-string v1, "000000ffff"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ltg/k$a;->e(Ljava/lang/String;)Ltg/k;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lsg/b;->a:Ltg/k;

    .line 10
    .line 11
    return-void
.end method

.method public static final synthetic a()Ltg/k;
    .locals 1

    .line 1
    sget-object v0, Lsg/b;->a:Ltg/k;

    .line 2
    .line 3
    return-object v0
.end method
