.class public abstract LEe/h;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LOe/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LEe/h$a;
    }
.end annotation


# static fields
.field public static final b:LEe/h$a;


# instance fields
.field private final a:LXe/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LEe/h$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LEe/h$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LEe/h;->b:LEe/h$a;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(LXe/f;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LEe/h;->a:LXe/f;

    return-void
.end method

.method public synthetic constructor <init>(LXe/f;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LEe/h;-><init>(LXe/f;)V

    return-void
.end method


# virtual methods
.method public getName()LXe/f;
    .locals 1

    .line 1
    iget-object v0, p0, LEe/h;->a:LXe/f;

    .line 2
    .line 3
    return-object v0
.end method
