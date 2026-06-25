.class public abstract Lcom/margelo/nitro/mmkv/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/margelo/nitro/mmkv/a$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/margelo/nitro/mmkv/a$a;

.field private static b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/margelo/nitro/mmkv/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/margelo/nitro/mmkv/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/margelo/nitro/mmkv/a;->a:Lcom/margelo/nitro/mmkv/a$a;

    .line 8
    .line 9
    return-void
.end method

.method public static final synthetic a()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/margelo/nitro/mmkv/a;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public static final synthetic b(Z)V
    .locals 0

    .line 1
    sput-boolean p0, Lcom/margelo/nitro/mmkv/a;->b:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final c()V
    .locals 1

    .line 1
    sget-object v0, Lcom/margelo/nitro/mmkv/a;->a:Lcom/margelo/nitro/mmkv/a$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/margelo/nitro/mmkv/a$a;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
