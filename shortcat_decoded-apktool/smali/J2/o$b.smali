.class public interface abstract LJ2/o$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LJ2/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "b"
.end annotation


# static fields
.field public static final a:LJ2/o$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LJ2/p;

    .line 2
    .line 3
    invoke-direct {v0}, LJ2/p;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LJ2/o$b;->a:LJ2/o$b;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic b(Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 0

    .line 1
    return-object p0
.end method


# virtual methods
.method public abstract a(Landroid/os/Bundle;)Landroid/os/Bundle;
.end method
