.class Lcom/shopify/reactnative/skia/g$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ll7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/shopify/reactnative/skia/g;->getReactModuleInfoProvider()Ll7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/shopify/reactnative/skia/g;


# direct methods
.method constructor <init>(Lcom/shopify/reactnative/skia/g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/shopify/reactnative/skia/g$a;->a:Lcom/shopify/reactnative/skia/g;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 12

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const-class v1, Lcom/shopify/reactnative/skia/RNSkiaModule;

    .line 7
    .line 8
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x0

    .line 13
    aget-object v1, v1, v2

    .line 14
    .line 15
    const-class v2, Lk7/a;

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    check-cast v2, Lk7/a;

    .line 22
    .line 23
    invoke-interface {v2}, Lk7/a;->name()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    new-instance v4, Lcom/facebook/react/module/model/ReactModuleInfo;

    .line 28
    .line 29
    invoke-interface {v2}, Lk7/a;->name()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    invoke-interface {v2}, Lk7/a;->canOverrideExistingModule()Z

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    invoke-interface {v2}, Lk7/a;->needsEagerInit()Z

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    invoke-interface {v2}, Lk7/a;->hasConstants()Z

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    invoke-interface {v2}, Lk7/a;->isCxxModule()Z

    .line 50
    .line 51
    .line 52
    move-result v10

    .line 53
    const-class v2, Lcom/facebook/react/turbomodule/core/interfaces/TurboModule;

    .line 54
    .line 55
    invoke-virtual {v2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 56
    .line 57
    .line 58
    move-result v11

    .line 59
    invoke-direct/range {v4 .. v11}, Lcom/facebook/react/module/model/ReactModuleInfo;-><init>(Ljava/lang/String;Ljava/lang/String;ZZZZZ)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    return-object v0
.end method
