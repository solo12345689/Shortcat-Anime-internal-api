.class public interface abstract LY/t0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LZd/i$b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY/t0$a;,
        LY/t0$b;
    }
.end annotation


# static fields
.field public static final R:LY/t0$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, LY/t0$b;->a:LY/t0$b;

    .line 2
    .line 3
    sput-object v0, LY/t0;->R:LY/t0$b;

    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public abstract A1(Lkotlin/jvm/functions/Function1;LZd/e;)Ljava/lang/Object;
.end method

.method public getKey()LZd/i$c;
    .locals 1

    .line 1
    sget-object v0, LY/t0;->R:LY/t0$b;

    .line 2
    .line 3
    return-object v0
.end method
