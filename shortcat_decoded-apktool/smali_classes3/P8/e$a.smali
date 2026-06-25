.class public LP8/e$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LP8/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP8/e$a$a;
    }
.end annotation


# static fields
.field public static final c:LP8/e$a;


# instance fields
.field public final a:LQ8/p;

.field public final b:Landroid/os/Looper;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LP8/e$a$a;

    .line 2
    .line 3
    invoke-direct {v0}, LP8/e$a$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, LP8/e$a$a;->a()LP8/e$a;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, LP8/e$a;->c:LP8/e$a;

    .line 11
    .line 12
    return-void
.end method

.method private constructor <init>(LQ8/p;Landroid/accounts/Account;Landroid/os/Looper;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP8/e$a;->a:LQ8/p;

    iput-object p3, p0, LP8/e$a;->b:Landroid/os/Looper;

    return-void
.end method

.method synthetic constructor <init>(LQ8/p;Landroid/accounts/Account;Landroid/os/Looper;LP8/n;)V
    .locals 0

    const/4 p2, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3}, LP8/e$a;-><init>(LQ8/p;Landroid/accounts/Account;Landroid/os/Looper;)V

    return-void
.end method
