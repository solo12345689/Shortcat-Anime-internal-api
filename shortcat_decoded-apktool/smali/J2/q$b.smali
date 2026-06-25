.class public interface abstract LJ2/q$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ2/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "b"
.end annotation


# static fields
.field public static final a:LJ2/q$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LJ2/j;

    .line 2
    .line 3
    invoke-direct {v0}, LJ2/j;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LJ2/q$b;->a:LJ2/q$b;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Landroid/content/Context;)LJ2/q$b;
    .locals 1

    .line 1
    new-instance v0, LJ2/j;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LJ2/j;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public abstract b(LJ2/q$a;)LJ2/q;
.end method
